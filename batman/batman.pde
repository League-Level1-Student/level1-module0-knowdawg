
PImage pictureOfRecord;
int i = 1;
import ddf.minim.*;
Minim minim;
AudioPlayer song;

void setup(){

  size(500,500);
  pictureOfRecord= loadImage("record.jpg");
  pictureOfRecord.resize(500,500);
  image(pictureOfRecord, 0, 0);
  minim = new Minim(this);
  song = minim.loadFile("batman.wav", 512);
  song.play();
}

void draw(){

  
  if (mousePressed){
  rotateImage(pictureOfRecord, i);
  image(pictureOfRecord, 0, 0);
  i++;
  song.play();
  } else {
    
    song.pause();
  }
  
}

void rotateImage(PImage image, int amountToRotate) {
     translate(width/2, height/2);
     rotate(amountToRotate*TWO_PI/360);
     translate(-image.width/2, -image.height/2);
}