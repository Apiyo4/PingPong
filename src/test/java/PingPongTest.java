import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class PingPongTest {
 @Test
    public void runPingPong_CountUpTo1_ArrayList(){
     PingPong testPingPong = new PingPong();
     List<Object> expectedOutput = new ArrayList<Object>();
     expectedOutput.add(1);
     assertEquals(expectedOutput, testPingPong.runPingPong(1));
 }

 @Test
 public void runPingPong_countUpToGivenNumber_ArrayList() throws Exception {
  PingPong testPingPong = new PingPong();
  ArrayList<Object> expectedOutput = new ArrayList<Object>();
  expectedOutput.add(1);
  expectedOutput.add(2);
  assertEquals(expectedOutput, testPingPong.runPingPong(2));
 }

 @Test
 public void runPingPong_replaceMultiplesOf3_ArrayList() {
  PingPong testPingPong = new PingPong();
  ArrayList<Object> expectedOutput = new ArrayList<Object>();
  expectedOutput.add(1);
  expectedOutput.add(2);
  expectedOutput.add("ping");
  assertEquals(expectedOutput, testPingPong.runPingPong(3));
 }

 @Test
 public void runPingPong_replaceMultiplesOf5_ArrayList() {
  PingPong testPingPong = new PingPong();
  ArrayList<Object> expectedOutput = new ArrayList<Object>();
  expectedOutput.add(1);
  expectedOutput.add(2);
  expectedOutput.add("ping");
  expectedOutput.add(4);
  expectedOutput.add("pong");
  assertEquals(expectedOutput, testPingPong.runPingPong(5));
 }
}