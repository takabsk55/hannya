package com.example.takahiro.hannya2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.HashMap;

/**
 * Created by takab on 2018/01/26.
 */

public class Okyo extends AppCompatActivity{



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_okyo);
    }
    @Override
    protected void onStart() {

        super.onStart();
        String str ="観自在菩薩行深般若波羅蜜多時照見五蘊皆空度一切苦厄舍利子色不異空空不異色色即是空空即是色受想行識亦復如是舍利子是諸法空相不生不滅不垢不浄不増不減是故空中無色無受想行識無眼耳鼻舌身意無色声香味触法無眼界乃至無意識界無無明亦無無明尽乃至無老死亦無老死尽無苦集滅道無智亦無得以無所得故菩提薩埵依般若波羅蜜多故心無罣礙無罣礙故無有恐怖遠離一切顛倒夢想究竟涅槃三世諸仏依般若波羅蜜多故得阿耨多羅三藐三菩提故知般若波羅蜜多是大神呪是大明呪是無上呪是無等等呪能除一切苦真実不虚故説般若波羅蜜多呪即説呪曰羯諦羯諦波羅羯諦波羅僧羯諦菩提薩婆般若心経";
        final String[] okyoKanji=str.split("");

        String hira="かん じ ざい ぼ さつ ぎょう じん はん にゃ は ら み た じ しょう けん ご うん かい くう ど いっ さい く やく しゃ り し しき ふ い くう くう ふ い しき しき そく ぜ くう くう そく ぜ しき じゅ そう ぎょう しき やく ぶ にょ ぜ しゃ り し ぜ しょ ほう くう そう ふ しょう ふ めつ ふ く ふ じょう ふ ぞう ふ げん ぜ こ くう ちゅう む しき む じゅ そう ぎょう しき む げん に び ぜっ しん い む しき しょう こう み そく ほう む げん かい ない し む い しき かい む む みょう やく む む みょう じん ない し む ろう し やく む ろう し じん む く しゅう めつ どう む ち やく む とく い む しょ とく こ ぼ だい さっ た え はん にゃ は ら みっ た こ しん む けい げ む けい げ こ む う く ふ おん り いっ さい てん どう む そう く きょう ね はん さん ぜ しょ ぶつ え はん にゃ は ら みっ た こ とく あ のく た ら さん みゃく さん ぼ だい こ ち はん にゃ は ら みっ た ぜ だい じん しゅ ぜ だい みょう しゅ ぜ む じょう しゅ ぜ む とう どう しゅ のう じょ いっ さい く しん じつ ふ こ こ せつ はん にゃ は ら みっ た しゅ そく せつ しゅ わつ ぎゃ てい ぎゃ てい は ら ぎゃ てい は ら そう ぎゃ てい ぼ じ そわ か";
        final String[] okyoHira=hira.split(" ");

        final ResizeTextView okyo=findViewById(R.id.kan);
        final TextView text=findViewById(R.id.hira);


        okyo.setModelText("感");
        AlphaAnimation animation_alpha=new AlphaAnimation(1,0);
        animation_alpha.setDuration(1000);
        animation_alpha.setFillAfter(true);
        animation_alpha.setRepeatCount(okyoKanji.length);
        this.findViewById(R.id.kan).startAnimation(animation_alpha);

        animation_alpha.setAnimationListener(new Animation.AnimationListener() {
           int ii=1;
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {

            }

            @Override
            public void onAnimationRepeat(Animation animation) {
                ii++;
                text.setText(okyoHira[ii-1]);
                okyo.setText(okyoKanji[ii]);
                Log.d("test", String.valueOf(ii)+","+okyoHira[ii]+okyoKanji[ii]);
            }
        });

    }
}
