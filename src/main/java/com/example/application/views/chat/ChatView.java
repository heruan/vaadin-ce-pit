package com.example.application.views.chat;

import com.vaadin.flow.component.Text;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.PageTitle;
import com.example.application.views.MainLayout;

@PageTitle("Chat")
@Route(value = "chat", layout = MainLayout.class)
public class ChatView extends Div {

    public ChatView() {
        addClassName("chat-view");
        add(new Text("Content placeholder"));
    }

}
