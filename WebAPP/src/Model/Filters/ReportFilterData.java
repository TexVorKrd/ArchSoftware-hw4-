package Model.Filters;

import Model.Items.Customer;
import Model.Items.Group;
import Model.Items.Prodact;
import Model.Items.Produser;
import java.util.Date;

/**
 * Данные для формирования отчета
 */
public class ReportFilterData {
    Group group;
    Produser produser;
    Prodact prodact;
    Customer customer;
    Date startPeriod;
    Date stopPeriod;

    public ReportFilterData(Group group, Produser produser, Prodact prodact, Customer customer, Date startPeriod, Date stopPeriod) {
        this.group = group;
        this.produser = produser;
        this.prodact = prodact;
        this.customer = customer;
        this.startPeriod = startPeriod;
        this.stopPeriod = stopPeriod;
    }
}
