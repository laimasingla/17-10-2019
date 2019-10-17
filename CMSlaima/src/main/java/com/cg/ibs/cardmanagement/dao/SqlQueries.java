package com.cg.ibs.cardmanagement.dao;

public class SqlQueries {

	public static final String SELECT_DATA_FROM_CREDIT_CARD ="select credit_card_num, credit_card_status, name_on_cred_card, credit_cvv_num, credit_expiry_date, credit_card_type from credit_card";
	public static final String SELECT_DATA_FROM_DEBIT_CARD = "select debit_card_number, debit_card_status, name_on_deb_card, debit_cvv_num, debit_expiry_date, debit_card_type from debit_card";
	public static final String APPLY_NEW_DEBIT_CARD = "insert into query_log(query_ID,case_TimeStamp,status_of_query,account_num,UCI,define_query,customer_reference_ID)values(?,?,?,?,?,?,?)";
}