/*
 * This file was automatically generated by EvoSuite
 * Wed Nov 27 16:56:36 GMT 2019
 */

package com.saumitra.sessionmgmt.controller;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.saumitra.sessionmgmt.controller.SessionEndPoint;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SessionEndPoint_ESTest extends SessionEndPoint_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      SessionEndPoint sessionEndPoint0 = new SessionEndPoint();
      // Undeclared exception!
      try { 
        sessionEndPoint0.getSession();
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // redis/clients/jedis/Jedis
         //
         verifyException("com.saumitra.sessionmgmt.controller.SessionEndPoint", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      SessionEndPoint sessionEndPoint0 = new SessionEndPoint();
      // Undeclared exception!
      try { 
        sessionEndPoint0.createSession();
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // javax/servlet/http/HttpSession
         //
         verifyException("com.saumitra.sessionmgmt.controller.SessionEndPoint", e);
      }
  }
}
