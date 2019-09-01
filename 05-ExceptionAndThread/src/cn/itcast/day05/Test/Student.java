package cn.itcast.day05.Test;

public class Student {

    private String name;
    private int score;

    public Student() {
        super();
    }

    public Student(String name, int score) {
        setName(name);
        setScore(score);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }
    public void setScore(int score)
    {
        if (score < 0){
            throw new NullPointerException("score 小于 0" +score);

        }
        this.score = score;
    }
}

