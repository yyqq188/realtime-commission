package realtime.ods.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * author: yhl
 * time: 2021/5/27 上午10:15
 * company: gientech
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductionDetail implements Serializable {
    private String detail_id;
    private String production_id;
    private String policy_id;
    private String item_id;
    private String product_id;
    private String policy_year;
    private String production_value;
    private String effective_date;
    private String hierarchy_date;
    private String producer_id;
    private String producer_position;
    private String benefit_type;
    private String fee_type;
    private String charge_mode;
    private String prem_list_id;
    private String comm_item_id;
    private String policy_chg_id;
    private String exchange_rate;
    private String related_id;
    private String insured_id;
    private String pol_production_value;
    private String pol_currency_id;
    private String hierarchy_exist_indi;
    private String team_prod_indi;
    private String personal_prod;
    private String period_type;
    private String x_months;
    private String team_prod_level;
    private String is_add_ridr;
}
