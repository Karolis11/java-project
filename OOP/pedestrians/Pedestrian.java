package OOP.pedestrians;

import OOP.motorVehicles.Directions;

public class Pedestrian {
    private Gender gender;
    private Directions walkingDir;
    private int age;
    private int weight;
    private int x = 0;
    private int y = 0;

    public Pedestrian(){
        this(Gender.Unknown, 18, 80);
    }

    public Pedestrian(Gender gen, int age, int weight){
        this.gender = gen;
        this.walkingDir = Directions.None;
        this.age = age;
        this.weight = weight;
    }

    public void move(Directions dir, int distance){
        this.walkingDir = dir;
        if(this.walkingDir == Directions.Forward){
            this.y += distance;
        }
        if(this.walkingDir == Directions.Backwards){
            this.y -= distance;
        }
        if(this.walkingDir == Directions.Right){
            this.x += distance;
        }
        if(this.walkingDir == Directions.Left){
            this.x -= distance;
        }
    }
}



