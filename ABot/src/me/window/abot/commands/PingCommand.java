package me.window.abot.commands;

import me.window.abot.util.Command;
import net.dv8tion.jda.api.entities.Message;
import net.dv8tion.jda.api.entities.MessageChannel;

public class PingCommand extends Command{
	public static void call(Message msg, MessageChannel channel) {
		long time = System.currentTimeMillis();
        channel.sendMessage("Pong!") /* => RestAction<Message> */
               .queue(response /* => Message */ -> {
                   response.editMessageFormat("Pong: %d ms", System.currentTimeMillis() - time).queue();
               });
	}
}
