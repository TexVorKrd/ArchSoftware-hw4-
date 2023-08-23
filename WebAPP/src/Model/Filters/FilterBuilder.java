package Model.Filters;

/**
 * Builder для фильтра привязанного к отчету.
 * Формирут поля фильтра которые могут быть применены к отчету.
 */
public class FilterBuilder {
    private boolean group=false;
    private boolean produser=false;
    private boolean prodact=false;
    private boolean customer=false;
    private boolean startPeriod=false;
    private boolean stopPeriod=false;

    FilterBuilder group(){
        this.group=true;
        return this;
    }

    FilterBuilder produser(){
        this.produser=true;
        return this;
    }

    FilterBuilder prodact(){
        this.prodact=true;
        return this;
    }

    FilterBuilder customer(){
        this.customer=true;
        return this;
    }

    FilterBuilder startPeriod(){
        this.startPeriod=true;
        return this;
    }

    FilterBuilder stopPeriod(){
        this.stopPeriod=true;
        return this;
    }

    ReportFilterMask create(){
        return new ReportFilterMask(group,produser,prodact,customer,startPeriod,stopPeriod);
    }

}
