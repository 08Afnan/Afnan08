package algonquin.cst2335.afnansAndroidLab.data;

import androidx.lifecycle.ViewModel;

import java.util.ArrayList;

import algonquin.cst2335.afnansAndroidLab.ChatMessage;

public class ChatRoomViewModel extends ViewModel {
    public ArrayList<ChatMessage> messages = new ArrayList<>();
}
