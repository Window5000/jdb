package me.window.abot.commands.slash;

import net.dv8tion.jda.api.events.interaction.SlashCommandEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class PingSlash extends ListenerAdapter {
	
	@Override
    public void onSlashCommand(SlashCommandEvent event)
    {
        if (!event.getName().equals("ping") && !event.getName().equals("botping")) return; // make sure we handle the right command
        long time = System.currentTimeMillis();
        event.reply("Pong!").setEphemeral(true) // reply or acknowledge
             .flatMap(v ->
                 event.getHook().editOriginalFormat("Pong: %d ms", System.currentTimeMillis() - time) // then edit original
             ).queue(); // Queue both reply and edit
    }

}
