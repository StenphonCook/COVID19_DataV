package top.warmj.covid19_DataV.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.warmj.covid19_DataV.dao.AllDataDao;
import top.warmj.covid19_DataV.domain.BasicData;
import top.warmj.covid19_DataV.domain.ProvinceData;
import top.warmj.covid19_DataV.domain.ProvinceDetails;
import top.warmj.covid19_DataV.domain.Timelinedata;
import top.warmj.covid19_DataV.service.AllDataService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service("allDataService")
public class AllDataServiceImpl implements AllDataService {

    @Autowired
    AllDataDao allDataDao;

    @Override
    public BasicData getBasicData() {
        return allDataDao.getBasicData();
    }

    @Override
    public List<ProvinceData> getProvinceData() {
        return allDataDao.getProvinceData();
    }

    @Override
    public List<Timelinedata> getTimeLineData(String startdate, String enddate) {
        Map<String, Object> map = new HashMap<>();
        map.put("startdate", startdate);
        map.put("enddate", enddate);
        return allDataDao.getTimeLineData(map);
    }

    @Override
    public List<ProvinceDetails> getProvinceDetails(String name) {
        return allDataDao.getProvinceDetails(name);
    }
}
