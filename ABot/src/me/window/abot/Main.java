package me.window.abot;

import javax.security.auth.login.LoginException;

import me.window.abot.util.Config;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.Activity;
import net.dv8tion.jda.api.utils.Compression;
import net.dv8tion.jda.api.utils.cache.CacheFlag;

public class Main {

	public static void main(String[] args) throws LoginException {
		
		JDA jda = JDABuilder.createDefault(Config.token).disableCache(CacheFlag.MEMBER_OVERRIDES, CacheFlag.VOICE_STATE).setBulkDeleteSplittingEnabled(false).setCompression(Compression.NONE).build();
		
		
		jda.getPresence().setActivity(Activity.playing("absolutely nothing"));
	}

}
