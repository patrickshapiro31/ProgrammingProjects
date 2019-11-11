/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab12;

import java.util.Calendar; 
import java.util.GregorianCalendar;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;

public class CountdownClockPane extends Pane {
  private int time;
  private int hour;
  private int minute;
  private int second;
  Line mLine, hLine;
  /** Construct a default clock with the current time*/
  public CountdownClockPane() {}

  /** Construct a clock with specified hour, minute, and second */
  public CountdownClockPane(int hour, int minute, int second) {
    this.hour = hour;
    this.minute = minute;
    this.second = second;
  }

  /** Return hour */
  public int getHour() {
    return hour;
  }

  /** Set a new hour */
  public void setHour(int hour) {
    this.hour = hour;
    paintClock();
  }

  /** Return minute */
  public int getMinute() {
    return minute;
  }

  /** Set a new minute */
  public void setMinute(int minute) {
    this.minute = minute;
    paintClock();
  }

  /** Return second */
  public int getSecond() {
    return second;
  }
  
    /** Return second */
  public int getTime() {
    return time;
  }

  /** Set a new second */
  public void setSecond(int second) {
    this.second = second;
    paintClock();
  }
  
  /* Set the current time for the clock */
  public void setCurrentTime(int inputSeconds) {
    // Construct a calendar for the current date and time
    Calendar calendar = new GregorianCalendar();
    time = inputSeconds;
    // Set current hour, minute and second
    int hoursec;
    int minsec;
    
    this.hour = 0 - (time/3600);
    hoursec = (time/3600) * 3600;
    this.minute = 0 - ((time - hoursec) / 60);
    minsec = ((time - hoursec) / 60) * 60;
    this.second = 0 - (time - (hoursec + minsec));
    
    paintClock(); // Repaint the clock
  }
  
    /* Set the current time for the clock */
  public void setNewTime() {
    // Construct a calendar for the current date and time
    Calendar calendar = new GregorianCalendar();
    time--;
    int hoursec, minsec;
    // Set current hour, minute and second
    this.hour = 0 - (time/3600);
    hoursec = (time/3600) * 3600;
    this.minute = 0 - ((time - hoursec) / 60);
    minsec = ((time - hoursec) / 60) * 60;
    this.second = 0 - (time - (hoursec + minsec));
    
    
    paintClock(); // Repaint the clock
  }

  
  /** Paint the clock */
  private void paintClock() {
    // Initialize clock parameters
    double clockRadius = 
      Math.min(getWidth(), getHeight()) * 0.8 * 0.5;
    double centerX = getWidth() / 2;
    double centerY = getHeight() / 2;

    // Draw circle
    Circle circle = new Circle(centerX, centerY, clockRadius);
    circle.setFill(Color.WHITE);
    circle.setStroke(Color.BLACK);
    Text t1 = new Text(centerX - 5, centerY - clockRadius + 12, "12");
    Text t2 = new Text(centerX - clockRadius + 3, centerY + 5, "9");
    Text t3 = new Text(centerX + clockRadius - 10, centerY + 3, "3");
    Text t4 = new Text(centerX - 3, centerY + clockRadius - 3, "6");
    
    // Draw second hand
    double sLength = clockRadius * 0.8;
    double secondX = centerX + sLength * 
      Math.sin(second * (2 * Math.PI / 60));
    double secondY = centerY - sLength * 
      Math.cos(second * (2 * Math.PI / 60));
    Line sLine = new Line(centerX, centerY, secondX, secondY);
    sLine.setStroke(Color.RED);

    // Draw minute hand
    if (time > 60)
    {
    
    double mLength = clockRadius * 0.65;
    double xMinute = centerX + mLength * 
      Math.sin(minute * (2 * Math.PI / 60));
    double minuteY = centerY - mLength * 
      Math.cos(minute * (2 * Math.PI / 60));
    mLine = new Line(centerX, centerY, xMinute, minuteY);
    mLine.setStroke(Color.BLUE);
    }
    
    if (time > 3600)
    {
    // Draw hour hand
    double hLength = clockRadius * 0.5;
    double hourX = centerX + hLength * 
      Math.sin((hour % 12 + minute / 60.0) * (2 * Math.PI / 12));
    double hourY = centerY - hLength *
      Math.cos((hour % 12 + minute / 60.0) * (2 * Math.PI / 12));
    hLine = new Line(centerX, centerY, hourX, hourY);
    hLine.setStroke(Color.GREEN);
    }
    
    getChildren().clear();
    if (time > 3600)
    getChildren().addAll(circle, t1, t2, t3, t4, sLine, mLine, hLine);
    else if (time > 60)
    getChildren().addAll(circle, t1, t2, t3, t4, sLine, mLine);
    else
    getChildren().addAll(circle, t1, t2, t3, t4, sLine);
  }
  
  @Override
  public void setWidth(double width) {
    super.setWidth(260);
    paintClock();
  }
  
  @Override
  public void setHeight(double height) {
    super.setHeight(260);
    paintClock();
  }
}