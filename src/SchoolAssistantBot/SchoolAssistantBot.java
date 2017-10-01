package schoolassistantbot;

import org.telegram.telegrambots.api.methods.send.SendMessage;
import org.telegram.telegrambots.api.objects.Update;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.exceptions.TelegramApiException;

public class SchoolAssistantBot extends TelegramLongPollingBot {

	@Override
	public void onUpdateReceived(Update update) {
		
		if(Database.hasStudent(update.getMessage().getFrom().getId()))
			try {
				sendMessage(new SendMessage().setText("I am your personal school assistant!").setChatId(update.getMessage().getChatId()));
				sendMessage(new SendMessage().setText("Say \"Help\" for a list of commands, or just say what you need!").setChatId(update.getMessage().getChatId()));
			} catch (TelegramApiException e) {
				System.err.println("Error sending welcome message:");
				e.printStackTrace();
			}
		
		if(update.hasMessage() && update.getMessage().hasText() && update.getMessage().getChat().getUserName() != null /* <-- this bot isn't useful for group chats */) {
			
			String input = update.getMessage().getText();
			if(input.startsWith("/")) {
				
				//they want to use commands
				
				
			} else {
				
				//they want the human-like assistant
				
			}
			
		}
	}
	
	@Override
	public String getBotUsername() {
		return "SchoolAssistantTestBot";
	}

	@Override
	public String getBotToken() {
		return "368899557:AAFzWTKzbuYB7auqRyK4yxU7vEC5g4_QRHc";
	}

}
