package com.example.duanappCloThes.Presenter;

import com.example.duanappCloThes.Models.Story;
import com.example.duanappCloThes.my_interface.IStory;
import com.example.duanappCloThes.my_interface.StoryView;

public class StoryPresenter implements IStory {

    private Story story;
    private StoryView callback;

    public StoryPresenter(StoryView callback){
        story = new Story(this);
        this.callback = callback;
    }

    public void HandleGetStory(String iduser){
        story.HandleGetStory(iduser);
    }
    @Override
    public void getDataStory(String noidung) {
        callback.getDataStory(noidung);
    }
}
