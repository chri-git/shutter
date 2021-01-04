package com.peterreischl.shutter.controller;

import java.io.IOException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping({"/shutter"})
public class ShutterController
{
  @RequestMapping({"/up"})
  public String up()
  {
    System.out.println("Moving UP");
    try
    {
      Runtime.getRuntime().exec("python up.py");
    }
    catch (IOException e)
    {
      e.printStackTrace();
      return "ERROR";
    }
    return "OK";
  }
  
  @RequestMapping({"/down"})
  public String down()
  {
    System.out.println("Moving DOWN");
    try
    {
      Runtime.getRuntime().exec("python down.py");
    }
    catch (IOException e)
    {
      e.printStackTrace();
      return "ERROR";
    }
    return "OK";
  }
}