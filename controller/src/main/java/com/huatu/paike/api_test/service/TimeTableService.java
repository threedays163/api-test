package com.huatu.paike.api_test.service;

import com.huatu.paike.api_test.dto.TimeTableDto;

import java.util.Date;
import java.util.List;

public interface TimeTableService {

    List<TimeTableDto> classTableList(Date startDate, Date endDate);
}
