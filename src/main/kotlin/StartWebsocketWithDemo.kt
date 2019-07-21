import ai.tock.bot.api.client.newBot
import ai.tock.bot.api.client.newStory
import ai.tock.bot.api.websocket.startWithDemo

fun main() {
    startWithDemo( // Integrate with the Tock demo platform by default
            newBot(
                    "PUT-YOUR-TOCK-APP-API-KEY-HERE", // Get your app API key from Bot Configurations in Tock Studio
                    newStory("who-are-you") { // Answer for the 'who-are-you' story
                        send("I'm a bot, built with Tock")
                        end("How can I help?")
                    }
            )
    )
}
