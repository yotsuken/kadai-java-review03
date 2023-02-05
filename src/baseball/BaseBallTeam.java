package baseball;

//野球のクラス
public class BaseBallTeam {

    //フィールド
    private String name;  //チーム名
    private int win;      //勝ち
    private int lose;     //負け
    private int draw;     //引き分け

    //引数なしのコンストラクタ
    public BaseBallTeam() {
    }
    
    //引数ありのコンストラクタ
    public BaseBallTeam(String name, int win, int lose, int draw) {
        this.name = name;
        this.win = win;
        this.lose = lose;
        this.draw = draw;
    }

    //各値を反させる
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWin() {
        return this.win;
    }

    public void setWin(int win) {
        this.win = win;
    }

    public int getLose() {
        return this.lose;
    }

    public void setLose(int lose) {
        this.lose = lose;
    }

    public int getdraw() {
        return this.draw;
    }

    public void setdraw(int draw) {
        this.draw = draw;
    }


    //勝率を求めるメソッド

    public double getRate() {
      
        //勝率の計算式を記載
        return(double)this.win/(this.win+this.lose);

    }

    public void report() {
        System.out.println(this.name + "の2022年の成績は" + this.win + "勝" + this.lose + "敗"+ this.draw + "分," +"勝率は" + getRate() +"です。" );
    }




}
