package net.thanon.Discord;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.entities.MessageEmbed;
import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import java.awt.*;

public class Listener extends ListenerAdapter {
    @Override
    public void onSlashCommandInteraction(SlashCommandInteractionEvent e) {
        switch (e.getName()) {
            case "links" -> {
                MessageEmbed embed = new EmbedBuilder()
                        .setColor(Color.MAGENTA)
                        .setTitle("Thanon's social media")
                        .setDescription("Youtube: https://www.youtube.com/@TTCallabout\nTwitch: https://www.twitch.tv/thanongaming\nTikTok: https://www.tiktok.com/@thanon_gaming\nDiscord: \nTwitter/X: https://x.com/ThanonCG")
                        .build();
                e.getChannel().sendMessageEmbeds(embed).queue();
            }
        }
        super.onSlashCommandInteraction(e);
    }
}
