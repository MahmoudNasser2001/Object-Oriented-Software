//package c322.labs.Lab6.PartB;
//
//import java.rmi.server.UnicastRemoteObject;
//
//public abstract class GumballMachine extends UnicastRemoteObject implements GumballMachineRemote {
//
//    private int count;
//    private State soldOutState;
//    private State noQuarterState;
//    private State hasQuarterState;
//    private State soldState;
//    private State winnerState;
//
//    private State state;
//
//    public GumballMachine(int count) {
//        this.count = count;
//        this.soldOutState = new SoldOutState(this);
//        this.noQuarterState = new NoQuarterState(this);
//        this.hasQuarterState = new HasQuarterState(this);
//        this.soldState = new SoldState(this);
//        this.winnerState = new WinnerState(this);
//
//        if (count > 0) {
//            state = noQuarterState;
//        } else {
//            state = soldOutState;
//        }
//    }
//
//    public void insertQuarter() {
//        state.insertQuarter();
//    }
//
//    public void ejectQuarter() {
//        state.ejectQuarter();
//    }
//
//    public void turnCrank() {
//        state.turnCrank();
//        state.dispense();
//    }
//
//    public void setState(State state) {
//        this.state = state;
//    }
//
//    public State getState() {
//        return state;
//    }
//
//    public State getSoldOutState() {
//        return soldOutState;
//    }
//
//    public State getNoQuarterState() {
//        return noQuarterState;
//    }
//
//    public State getHasQuarterState() {
//        return hasQuarterState;
//    }
//
//    public State getSoldState() {
//        return soldState;
//    }
//
//    public State getWinnerState() {
//        return winnerState;
//    }
//
//    public int getCount() {
//        return count;
//    }
//
//    public void releaseBall() {
//        System.out.println("A gumball comes rolling out the slot...");
//        if (count != 0) {
//            count = count - 1;
//        }
//    }
//
//}
