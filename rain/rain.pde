
 int score = 0;
 int rainY = 50;
 int rainX = (int) random(width);
 int rainY2 = 50;
 int rainX2 = (int) random(width);
 int rainY3 = 50;
 int rainX3 = (int) random(width);
 int BX = 50;
 
//int rainY = 50;

void setup(){
  
  size(500,900);

  
}


void draw(){
  double score2 = score/2;
  double score3 = score2/2;
  background(255, 0, 0);
  
  stroke(0, 255, 0);
  
  fill(0,0, 255);
  ellipse(rainX, rainY, 50, 50);
  rainY+= score + 5;
  
  if (score > 10){
  ellipse(rainX2, rainY2, 50, 20);
  rainY2+= score2 + 5;
  rainX2 += 1;
  }
  
  if (score > 20){
  ellipse(rainX3, rainY3, 20, 50);
  rainY3+= score3 + 5;
  rainX3 += 3;
  }
  
  BX = mouseX;
  
  fill(255,255,255);
  rect(BX, 850, 200, 30);
  
  if ((rainY > 800) && (rainX < (mouseX + 200)) && ((rainX > (mouseX -40)))){
    
    rainX = (int) random(width);
     rainY = 50;
    score += 1;
    
  }
   if ((rainY2 > 800) && (rainX2 < (mouseX + 200)) && ((rainX2 > (mouseX -40)))){
    
     rainX2 = (int) random(width);
     rainY2 = 50;
    score += 1;
     
   }
   
   if ((rainY3 > 800) && (rainX3 < (mouseX + 200)) && ((rainX3 > (mouseX -40)))){
    
     rainX3 = (int) random(width);
     rainY3 = 50;
    score += 1;
     
   }
  
  if (rainY > 900){
    
     rainX = (int) random(width);
     rainY = 50;
     score -= 1;
    
  }
  
  if (rainY2 > 900){
    
     rainX2 = (int) random(width);
     rainY2 = 50;
     score -= 1;
    
  }
  
  if (rainY3 > 900){
    
     rainX3 = (int) random(width);
     rainY3 = 50;
     score -= 1;
    
  }
  
  if (score < 1){
    
    score = 0;
    
  }
  
  fill(0, 0, 0);
textSize(16);
text("Score: " + score, 20, 20);


  
  
}