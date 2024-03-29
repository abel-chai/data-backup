package org.example.databackupback.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author:Gary
 * @ProjectName:data-backup-back
 * @Date: 2024/1/6 19:45
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BackupFileInfo {
    @TableId(type = IdType.AUTO)
    private Integer id;
    private String path;
    private String keyword;
}
