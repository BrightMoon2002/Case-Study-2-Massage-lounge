package control;

public class ManagerFacade {
    private AdminManager adminManager;
    private BillManager billManager;
    private CustomerManager customerManager;
    private IdolManager idolManager;
    private RoomManager roomManager;
    private  static ManagerFacade managerFacade;
    private ManagerFacade(){};
    private static ManagerFacade getInstance() {
        return managerFacade;
    }
}
