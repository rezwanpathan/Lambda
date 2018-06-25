package com.proxy;

public class ProxyPatternTest {

	public static void main(String[] args){
		CommandExecutor executor = new CommandExecutorProxy("Pankaj", "wrong_pwd");
		try {
			executor.runCommand("netsh");
			executor.runCommand(" rm -rf abc.pdf");
		} catch (Exception e) {
			System.out.println("Exception Message::"+e.getMessage());
		}
		
	}

}