
package com.huatu.paike;

import com.google.common.base.Preconditions;
import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class StageBatchDto {
    Long stageId;

    Long subjectId;

    Integer batchNum;

    public void validate(){
        Preconditions.checkArgument(stageId!=null,"stageId is null");
        Preconditions.checkArgument(subjectId!=null,"subjectId is null");
        Preconditions.checkArgument(batchNum!=null,"batchNum is null");

    }

}
