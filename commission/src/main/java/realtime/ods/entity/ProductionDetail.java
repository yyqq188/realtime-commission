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
    public String detail_id;
    public String production_id;
    public String policy_id;
    public String item_id;
    public String product_id;
    public String policy_year;
    public String production_value;
    public String effective_date;
    public String hierarchy_date;
    public String producer_id;
    public String producer_position;
    public String benefit_type;
    public String fee_type;
    public String charge_mode;
    public String prem_list_id;
    public String comm_item_id;
    public String policy_chg_id;
    public String exchange_rate;
    public String related_id;
    public String insured_id;
    public String pol_production_value;
    public String pol_currency_id;
    public String hierarchy_exist_indi;
    public String team_prod_indi;
    public String personal_prod;
    public String period_type;
    public String x_months;
    public String team_prod_level;
    public String is_add_ridr;
}
