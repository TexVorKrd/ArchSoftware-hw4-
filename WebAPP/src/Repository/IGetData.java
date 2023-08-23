package Repository;

import Model.Filters.ReportFilterData;
import Model.Filters.ReportFilterMask;

public interface IGetData<T> {
    T get(ReportFilterMask filterMask, ReportFilterData filterData,Repository repository);
}
