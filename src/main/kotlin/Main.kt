import com.github.kotlintelegrambot.bot
import com.github.kotlintelegrambot.dispatch
import com.github.kotlintelegrambot.dispatcher.command
import com.github.kotlintelegrambot.dispatcher.message
import com.github.kotlintelegrambot.entities.ChatId
import kotlin.random.Random

fun main() {

    var messageCount = 0

    val bot = bot {
        token = "6502215684:AAHIclrEuDmDRlffDNnheqFKth_2_B0BcKI"
        dispatch {

            message {

                messageCount++
                if (messageCount == 20) {
                    val random = Random.nextInt(0, wordsList.size)
                    bot.sendMessage(
                        chatId = ChatId.fromId(message.chat.id),
                        replyToMessageId = message.messageId,
                        text = wordsList[random]
                    )
                    messageCount = 0
                }
            }

            command("pidar") {
                val random = Random.nextInt(0, pidarList.size)
                bot.sendMessage(chatId = ChatId.fromId(message.chat.id), text = "${pidarList[random]} Підар")
            }

        }
    }
    bot.startPolling()
}

var pidarList: List<String> = listOf(
    "Артьом",
    "Артем",
    "Владік",
    "Марія",
    "Наташа",
    "Анна",
    "Александра",
    "Настя",
    "Яна",
    "Ніка",
    "Андрій",
    "Катя"
)

var wordsList: List<String> = listOf(
    "Підар",
    "Залупівка",
    "Пісюнковій Злодій",
    "Яйко-сподівайко",
    "Пупорізка",
    "Пiсюнець",
    "Нацюцюрнік",
    "Чіна",
    "Волосатий Джо",
    "Чухан",
    "Дайте дзигару",
    "Нюхай бебру",
    "Бабок хоть жопой жуй",
    "Сосать не рози нюхать",
    "Соси жопу",
    "Бублік ти йобаний",
    "Вась, сходи нахуй",
    "Іді нахуй - не ображайся",
    "Блювать хочу від тебе",
    "Здохни",
    "Гори в аду підар",
    "Путін хуйло",
    "Манюня",
    "А я тобі говорив",
    "Може на курілочку?",
    "419  сьогодні закрита",
    "Габела",
    "Надіюся завтра буде не сьогодні",
    "Що будемо робити далі?",
)
