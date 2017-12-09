package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    Button mAns1;
    Button mAns2;
    TextView mStoryLine;
    int mIndex;
    boolean where;

    ChangeStory []mChangeStory = new ChangeStory[]{
                new ChangeStory(R.string.T1_Story, R.string.T1_Ans1, R.string.T1_Ans2),
                new ChangeStory(R.string.T2_Story, R.string.T2_Ans1, R.string.T2_Ans2),
                new ChangeStory(R.string.T3_Story, R.string.T3_Ans1, R.string.T3_Ans2),
                new ChangeStory(R.string.T4_End),
                new ChangeStory(R.string.T5_End),
                new ChangeStory(R.string.T6_End),
        };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:

        mAns1 = (Button) findViewById(R.id.buttonTop);
        mAns2 = (Button) findViewById(R.id.buttonBottom);
        mStoryLine = (TextView) findViewById(R.id.storyTextView);
        mStoryLine.setText(mChangeStory[mIndex].getStoryId());
        mAns1.setText(mChangeStory[mIndex].getAns1());
        mAns2.setText(mChangeStory[mIndex].getAns2());
        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:

        mAns1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("destini","mIndex = "+mIndex);
                switch (mIndex) {
                    case 0:
                        Log.d("Destini","Top Botton pressed Displaying Story 3");
                        mStoryLine.setText(mChangeStory[2].getStoryId());
                        mAns1.setText(mChangeStory[2].getAns1());
                        mAns2.setText(mChangeStory[2].getAns2());
                        where = true;
                        mIndex=1;
                        break;
                    case 1:
                        if (where == true) {
                            Log.d("Destini","Top Botton pressed Displaying Story 6 End");
                            mStoryLine.setText(mChangeStory[5].getStoryId());
                            mAns1.setVisibility(View.INVISIBLE);
                            mAns2.setVisibility(View.INVISIBLE);
                        } else {
                            Log.d("Destini","Top Botton pressed Displaying Story 3");
                            mStoryLine.setText(mChangeStory[2].getStoryId());
                            mAns1.setText(mChangeStory[2].getAns1());
                            mAns2.setText(mChangeStory[2].getAns2());
                            where = true;
                        }
                        break;

                }
            }
        });



        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:

        mAns2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch(mIndex)
                {
                    case 0 : mStoryLine.setText(mChangeStory[1].getStoryId());
                        mAns1.setText(mChangeStory[1].getAns1());
                        mAns2.setText(mChangeStory[1].getAns2());
                        mIndex=1;
                        break;
                    case 1 : if(where==true)
                    {
                        Log.d("Destini","Top Botton pressed Displaying Story 5 End");
                        mStoryLine.setText(mChangeStory[4].getStoryId());
                        mAns1.setVisibility(View.INVISIBLE);
                        mAns2.setVisibility(View.INVISIBLE);
                    } else {
                        Log.d("Destini","Top Botton pressed Displaying Story 4");
                        mStoryLine.setText(mChangeStory[3].getStoryId());
                        mAns1.setVisibility(View.INVISIBLE);
                        mAns2.setVisibility(View.INVISIBLE);
                    }
                        break;
                }

            }
        });
    }
}
