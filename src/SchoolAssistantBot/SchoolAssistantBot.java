package schoolassistantbot;

import org.telegram.telegrambots.api.objects.Update;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;

public class SchoolAssistantBot extends TelegramLongPollingBot {

	@Override
	public void onUpdateReceived(Update update) {
		if(update.hasMessage() && update.getMessage().hasText()) {
			
		}
	}
	
	@Override
	public String getBotUsername() {
		return "SchoolAssistantTestBot";
	}

	@Override
	public String getBotToken() {
		return "API_KEY_HERE";
	}

}
