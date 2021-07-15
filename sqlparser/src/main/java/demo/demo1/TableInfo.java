package demo.demo1;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.flink.api.common.typeinfo.TypeInformation;

import java.util.Map;
import java.util.Properties;

/**
 * author: yhl
 * time: 2021/6/16 下午1:35
 * company: gientech
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TableInfo {
    private String tableName;
    private Map<String,String> fieldsInfo;
    private TypeInformation<?>[] fieldsType;
    private Properties props;
    private boolean isSideTable; //是否是维表
}
