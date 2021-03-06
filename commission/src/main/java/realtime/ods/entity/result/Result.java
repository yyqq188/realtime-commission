package realtime.ods.entity.result;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * author: yhl
 * time: 2021/6/8 下午2:33
 * company: gientech
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Result {
    public String policy_id;
    public String item_id;
    public String discount_num;
}

