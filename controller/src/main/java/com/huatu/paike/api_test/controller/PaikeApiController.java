package com.huatu.paike.api_test.controller;

import com.huatu.common.utils.ApiResult;
import com.huatu.common.utils.ApiResultUtils;
import com.huatu.paike.service.ConflictService;
import com.huatu.paike.service.LessonDetailService;
import com.huatu.paike.service.dto.req.PlaceLessonDateReq;
import com.huatu.paike.service.dto.req.StudentLessonReqDto;
import com.huatu.paike.service.dto.req.TeacherLessonDateReq;
import com.huatu.paike.service.dto.resp.DetectResp;
import com.huatu.paike.service.dto.resp.TeacherLessonDateResp;
import com.huatu.paike.service.dto.resp.TeacherLessonResp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class PaikeApiController {

    @Autowired
    LessonDetailService lessonDetailService;

    @Autowired
    ConflictService conflictService;

    @RequestMapping("/teacher/lessonDate.json")
    @ResponseBody
    public ApiResult queryTeacherLessonDate(@RequestBody TeacherLessonDateReq req){
        TeacherLessonDateResp resp =lessonDetailService.queryTeacherLessonDate(req);
        return ApiResultUtils.buildApiResult(resp,req.getPageDto());
    }

    @RequestMapping("/teacher/lesson.json")
    @ResponseBody
    public ApiResult queryTeacherLesson(@RequestBody TeacherLessonDateReq req){
        TeacherLessonResp resp =lessonDetailService.queryTeacherLesson(req);
        return ApiResultUtils.buildApiResult(resp,req.getPageDto());
    }

    @PostMapping("/conflict/teacherLessonDetect.json")
    @ResponseBody
    public ApiResult teacherLessonDetect(@RequestBody TeacherLessonDateReq req){
        DetectResp resp =conflictService.teacherLessonDetect(req);
        return ApiResultUtils.buildApiResult(resp);
    }

    @PostMapping("/conflict/placeDetect.json")
    @ResponseBody
    public ApiResult placeLessonDetect(@RequestBody PlaceLessonDateReq req){
        DetectResp resp=conflictService.placeDetect(req);
        return ApiResultUtils.buildApiResult(resp);
    }

    @PostMapping("/student/placeDetect.json")
    @ResponseBody
    public ApiResult getStudentLessonDetail(@RequestBody StudentLessonReqDto req){
        return ApiResultUtils.buildApiResult(lessonDetailService.getStudentLessonDetail(req));
    }
}
