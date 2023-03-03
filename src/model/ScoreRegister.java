package model;

public class ScoreRegister implements Comparable<ScoreRegister>{

    private int score;
    private String name;
    private ScoreRegister left;
    private ScoreRegister right;

    public ScoreRegister(int score, String name){
        this.score=score;
        this.name=name;
    }



    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ScoreRegister getLeft() {
        return left;
    }

    public void setLeft(ScoreRegister left) {
        this.left = left;
    }

    public ScoreRegister getRight() {
        return right;
    }

    public void setRight(ScoreRegister right) {
        this.right = right;
    }

    public String toString(){
        return "Name: "+name+" Score: "+score;
    }

    @Override
    public int compareTo(ScoreRegister o) {
        return this.name.compareTo(o.getName());
    }

    public void setStadistics(ScoreRegister sr){
        this.score=sr.getScore();
        this.name=sr.getName();
    }
}
