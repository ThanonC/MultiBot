package net.thanon.Discord;

import io.github.cdimascio.dotenv.Dotenv;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.Guild;
import net.dv8tion.jda.api.interactions.commands.build.Commands;
import net.dv8tion.jda.api.requests.GatewayIntent;
import net.dv8tion.jda.api.requests.restaction.CommandListUpdateAction;
import net.thanon.Utils.Config;

public class Bot {
    private JDABuilder jda;
    public Bot() {
         jda = JDABuilder.createDefault(new Config().getString("discord.bot.token"))
                .enableIntents(GatewayIntent.GUILD_MESSAGES, GatewayIntent.GUILD_MEMBERS, GatewayIntent.MESSAGE_CONTENT)
                .addEventListeners(new Listener());
    }
    public Bot start() throws InterruptedException {
        return (Bot) jda.build().awaitReady();
    }
    public String shutdown() {
        return "idk do this, I have to look into the thing later, I will now go and cry";
    }
}
