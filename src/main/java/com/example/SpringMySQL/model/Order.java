package com.example.SpringMySQL.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;
import java.text.SimpleDateFormat;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
//To specify a specific date format, u use SimpleDateFormat
@Entity
@Table(name = "orders")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Order {
    @Id
    @GeneratedValue
    private Integer id;
    private int id_raw;
    private String order_id;
    private String customer;
    private String type;
    private String ship_to;
    private String ship_to_address;
    String pattern = "yyyy-MM-dd";
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
    String ship_by_date = simpleDateFormat.format(new Date());
    String pack_by_date = simpleDateFormat.format(new Date());
    String inhouse_date = simpleDateFormat.format(new Date());
    String po_date = simpleDateFormat.format(new Date());
    String job_date = simpleDateFormat.format(new Date());
    private String source_facility;
    private String ship_via;
    private String part_number;
    private int part_quantity;
    private String part_description;
    private String escalate;
    private String job_required;
    private String line2;
    private String response_accept;
    private int epicor_order_id;
    private String job_number;
    String pattern1 = "yyyy-MM-dd hh:mm:ss";
    SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat(pattern1);
    String date_created = simpleDateFormat1.format(new Date());
    String date_updated = simpleDateFormat1.format(new Date());
    String date_picked_up = simpleDateFormat1.format(new Date());
    String date_completed = simpleDateFormat1.format(new Date());
    String pattern2 = "hh:mm:ss";
    SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat(pattern2);
    String time_taken = simpleDateFormat2.format(new Date());
    private int retrieve_count;
    private String audit_status;

    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }
    public Integer getId_raw() { return id_raw; }
    public void setId_raw(Integer id_raw) { this.id_raw = id_raw; }
    public String getOrder_id() { return order_id; }
    public void setOrder_id(String order_id) { this.order_id = order_id; }
    public String getCustomer() { return customer; }
    public void setCustomer(String customer) { this.customer = customer; }
    public String getType() { return type; }
    public void setType(String type) { this.type = type; }
    public String getShip_to() { return ship_to; }
    public void setShip_to(String ship_to) { this.ship_to = ship_to; }
    public String getShip_to_address() { return ship_to_address; }
    public void setShip_to_address(String ship_to_address) { this.ship_to_address = ship_to_address; }
    public String getShip_by_date() { return ship_by_date; }
    public void setShip_by_date(String ship_by_date) { this.ship_by_date = ship_by_date; }
    public String getPack_by_date() { return pack_by_date; }
    public void setPack_by_date(String pack_by_date) { this.pack_by_date = pack_by_date; }
    public String getInhouse_date() { return inhouse_date; }
    public void setInhouse_date(String inhouse_date) { this.inhouse_date = inhouse_date; }
    public String getPo_date() { return po_date; }
    public void setPo_date(String po_date) { this.po_date = po_date; }
    public String getJob_date() { return job_date; }
    public void setJob_date(String job_date) { this.job_date = job_date; }
    public String getSource_facility() { return source_facility; }
    public void setSource_facility(String source_facility) { this.source_facility = source_facility; }
    public String getShip_via() { return ship_via; }
    public void setShip_via(String ship_via) { this.ship_via = ship_via; }
    public String getPart_number() { return part_number; }
    public void setPart_number(String part_number) { this.part_number = part_number; }
    public int getPart_quantity() { return part_quantity; }
    public void setPart_quantity(int part_quantity) { this.part_quantity = part_quantity; }
    public String getPart_description() { return part_description; }
    public void setPart_description(String part_description) { this.part_description = part_description; }
    public String getEscalate() { return escalate; }
    public void setEscalate(String escalate) { this.escalate = escalate; }
    public String getJob_required() { return job_required; }
    public void setJob_required(String job_required) { this.job_required = job_required; }
    public String getLine2() { return line2; }
    public void setLine2(String line2) { this.line2 = line2; }
    public String getResponse_accept() { return response_accept; }
    public void setResponse_accept(String response_accept) { this.response_accept = response_accept; }
    public int getEpicor_order_id() { return epicor_order_id; }
    public void setEpicor_order_id(int epicor_order_id) { this.epicor_order_id = epicor_order_id; }
    public String getJob_number() { return job_number; }
    public void setJob_number(String job_number) { this.job_number = job_number; }
    public String getDate_created() { return date_created; }
    public void setDate_created(String date_created) { this.date_created = date_created; }
    public String getDate_updated() { return date_updated; }
    public void setDate_updated(String date_updated) { this.date_updated = date_updated; }
    public String getDate_picked_up() { return date_picked_up; }
    public void setDate_picked_up(String date_picked_up) { this.date_picked_up = date_picked_up; }
    public String getDate_completed() { return date_completed; }
    public void setDate_completed(String date_completed) { this.date_completed = date_completed; }
    public String getTime_taken() { return time_taken; }
    public void setTime_taken(String time_taken) { this.time_taken = time_taken; }
    public int getRetrieve_count() { return retrieve_count; }
    public void setRetrieve_count(int retrieve_count) { this.retrieve_count = retrieve_count; }
    public String getAudit_status() { return audit_status; }
    public void setAudit_status(String audit_status) { this.audit_status = audit_status; }
}
