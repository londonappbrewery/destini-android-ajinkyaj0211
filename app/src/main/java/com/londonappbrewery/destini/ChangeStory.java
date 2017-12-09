package com.londonappbrewery.destini;

/**
 * Created by Ajinkya Jadhav on 09-Dec-17.
 */

public class ChangeStory {
    private int mStoryId;
    private int mAns1, mAns2;
    public ChangeStory(int story)
    {
        mStoryId = story;
    }
    public ChangeStory(int story, int Ans1, int Ans2)
    {
        mStoryId= story;
        mAns1 = Ans1;
        mAns2 = Ans2;
    }

    public int getStoryId() {
        return mStoryId;
    }

    public int getAns1() {
        return mAns1;
    }

    public int getAns2() {
        return mAns2;
    }
}
