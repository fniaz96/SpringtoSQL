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
    private int id;
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
}
