package me.window.abot;

import javax.security.auth.login.LoginException;

import me.window.abot.commands.slash.PingSlash;
import me.window.abot.listeners.MessageListener;
import me.window.abot.util.Config;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.Activity;
import net.dv8tion.jda.api.requests.GatewayIntent;

public class Main{

	public static void main(String[] args) throws LoginException {
		
		JDA jda = JDABuilder.createLight(Config.token, GatewayIntent.GUILD_MESSAGES, GatewayIntent.DIRECT_MESSAGES).addEventListeners(new MessageListener(), new PingSlash()).build();
		
		
		jda.getPresence().setActivity(Activity.playing("absolutely nothing"));
		
		jda.upsertCommand("ping", "Calculate ping of the bot").queue();
		jda.upsertCommand("botping", "Calculate ping of the bot").queue();
	}

}
