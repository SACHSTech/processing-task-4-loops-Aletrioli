import processing.core.PApplet;

public class Sketch extends PApplet {
	
  public void settings() {
    size(400, 400);
  }

  int intTemp;

  public void setup() {
    background(255, 255, 255);
  }

  public void draw() {
	  
    // quadrant 1
    stroke(0);
    for(int lineX = 20; lineX <= 200; lineX += 20){
      line(lineX, 0, lineX, 200);
    }  

    for(int lineY = 20; lineY <= 200; lineY += 20){
      line(0, lineY, 200, lineY);
    } 

    // quadrant 2
    stroke(0);

    for (int circleY = 30; circleY <= 200; circleY += 35){
      for (int circleX = 230; circleX <= 400; circleX += 35){
        fill(212, 15, 125);
        ellipse(circleX, circleY, 20, 20);
      }
    }

    // quadrant 3
    stroke(0);

    double colour = 0;

    for (int lineX = 0; lineX <= 200; lineX++){
      line(lineX, 200, lineX, 400);
      
      colour += 1.25;
      stroke((int)colour, (int)colour, (int)colour);
    }

    // quadrant 4
    
    for(int i = 0; i < 2; i++){
      rotate(radians(45*i));
      fill(219, 84, 37);
      stroke(0, 0, 0);

      // vertical
      ellipse(424*sin(radians(45+45*i)), 424*cos(radians(45+45*i)), 18, 125);

      // horizontal
      ellipse(424*sin(radians(45+45*i)), 424*cos(radians(45+45*i)), 125, 18);
      
    }

    // reset rotation
    rotate(radians(315));
    stroke(38, 108, 45);
    fill(38, 108, 45);
    ellipse(300, 300, 35, 35);

  }  
}