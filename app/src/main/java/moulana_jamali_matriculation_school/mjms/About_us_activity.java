package moulana_jamali_matriculation_school.mjms;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.support.v4.content.res.ResourcesCompat;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ViewFlipper;

public class About_us_activity extends AppCompatActivity {

    @TargetApi(Build.VERSION_CODES.O)
    @RequiresApi(api = Build.VERSION_CODES.O)
    private TextView txt1,txt2;
    private ViewFlipper v_flipper,v_flipper2;

    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about_us);
        int images[]={R.drawable.dp,R.drawable.m3,R.drawable.m1,R.drawable.m2,R.drawable.c1,R.drawable.c2,R.drawable.c3,R.drawable.c4,R.drawable.c5};
        v_flipper=(ViewFlipper) findViewById(R.id.vflipper);


        for (int i=0;i<images.length;i++){

            FlipperImage(images[i]);
        }
        for (int image: images){
            FlipperImage(image);
        }

        // Find the TextView object
         txt1 = (TextView) findViewById(R.id.t1);

        // Create a TypeFace using the font file
        Typeface typeface = Typeface.createFromAsset(getAssets(), "bamini.ttf");
        // Set a text to the TextView
        txt1.setText(" vq;fs; gs;spapd; Nehf;fk; Foe;ijfspd; kdepiyf;F Vw;g mth;fis cUthf;FtjhFk;. fy;tp gazj;ij njhlq;Fk; koiyah;fSf;F vq;fs; gs;spapd; jpwik tha;e;j Mrphpah;fs; KO xj;Jiog;G jUtNjhL my;yhky; epge;jidaw;w md;Gld;; khzth;fspd; re;Njhrj;ijg; ngW;fpd;wdh;. NkYk; mth;fSf;Fs; xope;jpUf;Fk; jdp jpwikfis khzth;fNs czUk; tifapy; mth;fis cUthf;Ffpd;wdh;.  P\n" +
                "     vq;fs; gs;sp koiyah;fs; cw;rhfj;JlDk; re;Njhrj;JlDk; tUtJ xU mjpraky;y. vq;fs; md;whl gs;sp nray;ghLfis jtpu fhiy gpuhj;jidf; $l;lj;ij சிறுவர் விளையாட்டுமுறைக் கல்விக் Foe;ijfs; Kjy; cah; tFg;G khzth;fs; tiu mth;fNs elj;jp tUfpd;wdh;. ,Jkl;Lky;yhky; Foe;ijfSf;F rhptpfpj czT cl;nfhs;tjpd; gaid njhptpf;fNt fha;fwpfs; jpdj;ij nfhz;lhLfpwhh;fs;.\n" +
                "       khzth;fspd; kdjpy; Gije;Es;s vjph;fhy fdTfis mth;fs; Rje;jpukhf ntspgLj;j khWNtlg; Nghl;lpfs; elj;jg;gLfpd;wd. ,e;j ,Ugjhk; E}w;whz;lpy; elf;Fk; Ntjidahd nray;fis kdjpy; nfhz;L vq;fs; gs;sp khzth;fs; Kw;wpYk; Gjpa topapy; elf;f mth;fs; tho;Tf;F Mjhukhf cs;s jha; je;ijaplk; md;GlDk;, kupahijAlDk; vt;thW elf;f Ntz;Lk; vd czh;j;;Jk; tifapy; md;idah; kw;Wk;  je;ijah; jpdj;ij vk; gs;sp khzth;fs; kpfr; rpwg;ghf nfhz;lhLfpd;wdh;. NkYk; tajhd fhyj;jpy; jq;fsplk; md;Gk; MjuTk; fhl;l xUtUk; ,y;iyNa vd;w epiyapy; thOk; jhj;jh, ghl;lp mth;fspd; vz;zq;fis Nghf;Fk; tpjkhf jhj;jh, ghl;lp jpdj;ijAk; vq;fs; gs;sp khzth;fs; kpFe;j cw;rhfj;NjhL nfhz;lhLfpwhh;fs;.\n" +
                "            NkYk; khzt nry;tq;fSf;F jiyik gz;Gfis tsh;f;Fk; tpjkhf gs;spapd; eph;thfk; midj;ijAk; Mrphpah; jpdj;jd;W mth;fNs gs;spia topelj;Jthh;fs;.\n" +
                "            ,J xU nkl;hpFNyrd; gs;spahf ,Ue;jhYk; ,q;F Nghjpf;Fk; ghlj;jpl;lk சிபிஎஸ்இ, ஐசிஎஸ்இ,; ghlj;jpl;lj;jpw;F ,izahf ,q;F Nghjpf;fg;gLfpwJ. ehk; thOk; rKjhak; mwptpay; njhopy; El;gj;ij rhh;e;Nj cs;sJ. Mifahy; mwptpay; fz;fhl;rpia vq;fs; gs;spapd; elj;Jfpwhh;fs;.\n" +
                "         NkYk; khzth;fs; xt;nthUtUk; ey;y gz;Gfis tsh;f;Fk; tpjkhf mehij ,y;yq;fSf;F nrd;W jq;fshy; Klpe;j cjtpfis mth;fSf;F nra;J tUlj;jpy; xUKiw me;j ehis kpFe;j re;Njhrj;JlDk; kfpo;r;rpAlDk; nrytopf;fpd;wdh;.\n" +
                "          khzth;fs; cyf tp\\aq;fis mwpe;Jnfhs;Sk; tpjkhf fsg;gazk; Nkw;nfhz;L Ma;T nra;j tp\\aq;fis fUj;juq;F %ykhf tpthjk; nra;a khzth;fSf;F gapw;rpaspf;fg;gLfpwJ.\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "gs;spapd; rpwg;gk;rq;fs;:  \n" +
                "•\tjdpj;Jtkpf;f gs;sp ghlj;jpl;lk;\n" +
                "•\tetpd ghJfhg;G trjpAld; $lpa gs;sptshfk;\n" +
                "•\tஅருகலை trjpAld; $lpa gs;sp tshfk;\n" +
                "•\tetpdkakhf;fg;gl;l gs;sp miwfs; Smart class; trjp nra;ag;gl;Ls;sJ\n" +
                "•\tetPd E}yf trjp\n" +
                "•\tfuhj;Nj, rpyk;gk,; FjpiuNaw;wk; Nghd;w rpwg;G gapw;rpfs;\n" +
                "•\tfhw;Nwhl;l kw;Wk; Rfhjhu trjpAld; $lpa Rw;Wr;#oy;\n" +
                "•\tkhzth;fs; ,iw czh;Tld; tsu mtuth; kjj;jpw;F Vw;g gpuhj;jid $l;lq;fs; eilngWfpd;wd.\n");       // Set the typeface
        txt1.setTypeface(typeface);

    }

    public void FlipperImage(int image){
        ImageView imageView =new ImageView(this);
        imageView.setBackgroundResource(image);
        v_flipper.addView(imageView);
        v_flipper.setFlipInterval(2300);
        v_flipper.setAutoStart(true);
        v_flipper.setInAnimation(this,android.R.anim.slide_in_left);
        v_flipper.setOutAnimation(this,android.R.anim.slide_out_right);
    }
}
