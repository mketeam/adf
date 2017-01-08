package poc1.model.vo;

import java.math.BigDecimal;

import java.sql.Timestamp;

import poc1.model.extensions.MyViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Sun Jan 08 15:24:36 CET 2017
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class EmployeesVORowImpl extends MyViewRowImpl {
    public static final int ENTITY_EMPLOYEES = 0;

    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    protected enum AttributesEnum {
        EmployeeId,
        FirstName,
        LastName,
        Email,
        PhoneNumber,
        HireDate,
        JobId,
        Salary,
        CommissionPct,
        ManagerId,
        DepartmentId,
        EmployeesVO,
        DepartmentsVO,
        JobHistoryVO,
        DepartmentsVO1,
        EmployeesVO1;
        private static AttributesEnum[] vals = null;
        private static final int firstIndex = 0;

        protected int index() {
            return AttributesEnum.firstIndex() + ordinal();
        }

        protected static final int firstIndex() {
            return firstIndex;
        }

        protected static int count() {
            return AttributesEnum.firstIndex() + AttributesEnum.staticValues().length;
        }

        protected static final AttributesEnum[] staticValues() {
            if (vals == null) {
                vals = AttributesEnum.values();
            }
            return vals;
        }
    }
    public static final int EMPLOYEEID = AttributesEnum.EmployeeId.index();
    public static final int FIRSTNAME = AttributesEnum.FirstName.index();
    public static final int LASTNAME = AttributesEnum.LastName.index();
    public static final int EMAIL = AttributesEnum.Email.index();
    public static final int PHONENUMBER = AttributesEnum.PhoneNumber.index();
    public static final int HIREDATE = AttributesEnum.HireDate.index();
    public static final int JOBID = AttributesEnum.JobId.index();
    public static final int SALARY = AttributesEnum.Salary.index();
    public static final int COMMISSIONPCT = AttributesEnum.CommissionPct.index();
    public static final int MANAGERID = AttributesEnum.ManagerId.index();
    public static final int DEPARTMENTID = AttributesEnum.DepartmentId.index();
    public static final int EMPLOYEESVO = AttributesEnum.EmployeesVO.index();
    public static final int DEPARTMENTSVO = AttributesEnum.DepartmentsVO.index();
    public static final int JOBHISTORYVO = AttributesEnum.JobHistoryVO.index();
    public static final int DEPARTMENTSVO1 = AttributesEnum.DepartmentsVO1.index();
    public static final int EMPLOYEESVO1 = AttributesEnum.EmployeesVO1.index();

    /**
     * This is the default constructor (do not remove).
     */
    public EmployeesVORowImpl() {
        System.out.println("EmployeesVORowImpl");
    }
}

