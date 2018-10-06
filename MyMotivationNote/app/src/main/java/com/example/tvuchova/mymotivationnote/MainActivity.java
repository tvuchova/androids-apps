package com.example.tvuchova.mymotivationnote;

import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Motivation mMotivation = new Motivation();
    private ColorPicker mColorPicker = new ColorPicker();
    private TextView mMultilineText;
    private  TextView mAuthorView;
    private Button mNextButton;
    private RelativeLayout mRelativeLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mMultilineText = (TextView) findViewById(R.id.mMultilineText);
        mAuthorView= (TextView) findViewById(R.id.authorTextView);
        mNextButton=(Button)findViewById(R.id.nextButton);
        mRelativeLayout=(RelativeLayout)findViewById(R.id.mRelativeLayout);

        mNextButton.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Quote quote = mMotivation.getARandomQuote();
                int colorInInt=mColorPicker.getRandomColor();
                mMultilineText.setText(quote.getmQuote());
                mAuthorView.setText(quote.getmAuthor());
                mRelativeLayout.setBackgroundColor(colorInInt);

            }
        });
    }
}
