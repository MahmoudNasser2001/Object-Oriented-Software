//package c322.labs.Lab6.PartB;
//
//import java.rmi.RemoteException;
//
//public class GumballMachineTestDrive {
//    public static void main(String[] args) {
//        GumballMachineRemote gumballMachine1 = null;
//        GumballMachineRemote gumballMachine2 = null;
//        GumballMachineRemote gumballMachine3 = null;
//
//        try {
//            gumballMachine1 = (GumballMachineRemote) Naming.lookup("rmi://gumball1.c322.com/gumballmachine");
//            gumballMachine2 = (GumballMachineRemote) Naming.lookup("rmi://gumball2.c322.com/gumballmachine");
//            gumballMachine3 = (GumballMachineRemote) Naming.lookup("rmi://gumball3.c322.com/gumballmachine");
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//
//        GumballMonitor monitor1 = new GumballMonitor(gumballMachine1);
//        GumballMonitor monitor2 = new GumballMonitor(gumballMachine2);
//        GumballMonitor monitor3 = new GumballMonitor(gumballMachine3);
//
//        monitor1.report();
//        monitor2.report();
//        monitor3.report();
//    }
//}