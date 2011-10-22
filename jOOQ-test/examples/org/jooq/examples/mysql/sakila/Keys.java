/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.mysql.sakila;

/**
 * This class is generated by jOOQ.
 *
 * A class modelling foreign key relationships between tables of the sakila schema
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "1.6.8"},
                            comments = "This class is generated by jOOQ")
@SuppressWarnings({"unchecked"})
public class Keys extends org.jooq.impl.AbstractKeys {

	// IDENTITY definitions
	public static final org.jooq.Identity<org.jooq.examples.mysql.sakila.tables.records.ActorRecord, java.lang.Short> IDENTITY_actor = createIdentity(org.jooq.examples.mysql.sakila.tables.Actor.ACTOR, org.jooq.examples.mysql.sakila.tables.Actor.ACTOR_ID);
	public static final org.jooq.Identity<org.jooq.examples.mysql.sakila.tables.records.AddressRecord, java.lang.Short> IDENTITY_address = createIdentity(org.jooq.examples.mysql.sakila.tables.Address.ADDRESS, org.jooq.examples.mysql.sakila.tables.Address.ADDRESS_ID);
	public static final org.jooq.Identity<org.jooq.examples.mysql.sakila.tables.records.CategoryRecord, java.lang.Byte> IDENTITY_category = createIdentity(org.jooq.examples.mysql.sakila.tables.Category.CATEGORY, org.jooq.examples.mysql.sakila.tables.Category.CATEGORY_ID);
	public static final org.jooq.Identity<org.jooq.examples.mysql.sakila.tables.records.CityRecord, java.lang.Short> IDENTITY_city = createIdentity(org.jooq.examples.mysql.sakila.tables.City.CITY, org.jooq.examples.mysql.sakila.tables.City.CITY_ID);
	public static final org.jooq.Identity<org.jooq.examples.mysql.sakila.tables.records.CountryRecord, java.lang.Short> IDENTITY_country = createIdentity(org.jooq.examples.mysql.sakila.tables.Country.COUNTRY, org.jooq.examples.mysql.sakila.tables.Country.COUNTRY_ID);
	public static final org.jooq.Identity<org.jooq.examples.mysql.sakila.tables.records.CustomerRecord, java.lang.Short> IDENTITY_customer = createIdentity(org.jooq.examples.mysql.sakila.tables.Customer.CUSTOMER, org.jooq.examples.mysql.sakila.tables.Customer.CUSTOMER_ID);
	public static final org.jooq.Identity<org.jooq.examples.mysql.sakila.tables.records.FilmRecord, java.lang.Short> IDENTITY_film = createIdentity(org.jooq.examples.mysql.sakila.tables.Film.FILM, org.jooq.examples.mysql.sakila.tables.Film.FILM_ID);
	public static final org.jooq.Identity<org.jooq.examples.mysql.sakila.tables.records.InventoryRecord, java.lang.Integer> IDENTITY_inventory = createIdentity(org.jooq.examples.mysql.sakila.tables.Inventory.INVENTORY, org.jooq.examples.mysql.sakila.tables.Inventory.INVENTORY_ID);
	public static final org.jooq.Identity<org.jooq.examples.mysql.sakila.tables.records.LanguageRecord, java.lang.Byte> IDENTITY_language = createIdentity(org.jooq.examples.mysql.sakila.tables.Language.LANGUAGE, org.jooq.examples.mysql.sakila.tables.Language.LANGUAGE_ID);
	public static final org.jooq.Identity<org.jooq.examples.mysql.sakila.tables.records.PaymentRecord, java.lang.Short> IDENTITY_payment = createIdentity(org.jooq.examples.mysql.sakila.tables.Payment.PAYMENT, org.jooq.examples.mysql.sakila.tables.Payment.PAYMENT_ID);
	public static final org.jooq.Identity<org.jooq.examples.mysql.sakila.tables.records.RentalRecord, java.lang.Integer> IDENTITY_rental = createIdentity(org.jooq.examples.mysql.sakila.tables.Rental.RENTAL, org.jooq.examples.mysql.sakila.tables.Rental.RENTAL_ID);
	public static final org.jooq.Identity<org.jooq.examples.mysql.sakila.tables.records.StaffRecord, java.lang.Byte> IDENTITY_staff = createIdentity(org.jooq.examples.mysql.sakila.tables.Staff.STAFF, org.jooq.examples.mysql.sakila.tables.Staff.STAFF_ID);
	public static final org.jooq.Identity<org.jooq.examples.mysql.sakila.tables.records.StoreRecord, java.lang.Byte> IDENTITY_store = createIdentity(org.jooq.examples.mysql.sakila.tables.Store.STORE, org.jooq.examples.mysql.sakila.tables.Store.STORE_ID);

	// UNIQUE and PRIMARY KEY definitions
	public static final org.jooq.UniqueKey<org.jooq.examples.mysql.sakila.tables.records.ActorRecord> KEY_actor_PRIMARY = createUniqueKey(org.jooq.examples.mysql.sakila.tables.Actor.ACTOR, org.jooq.examples.mysql.sakila.tables.Actor.ACTOR_ID);
	public static final org.jooq.UniqueKey<org.jooq.examples.mysql.sakila.tables.records.AddressRecord> KEY_address_PRIMARY = createUniqueKey(org.jooq.examples.mysql.sakila.tables.Address.ADDRESS, org.jooq.examples.mysql.sakila.tables.Address.ADDRESS_ID);
	public static final org.jooq.UniqueKey<org.jooq.examples.mysql.sakila.tables.records.CategoryRecord> KEY_category_PRIMARY = createUniqueKey(org.jooq.examples.mysql.sakila.tables.Category.CATEGORY, org.jooq.examples.mysql.sakila.tables.Category.CATEGORY_ID);
	public static final org.jooq.UniqueKey<org.jooq.examples.mysql.sakila.tables.records.CityRecord> KEY_city_PRIMARY = createUniqueKey(org.jooq.examples.mysql.sakila.tables.City.CITY, org.jooq.examples.mysql.sakila.tables.City.CITY_ID);
	public static final org.jooq.UniqueKey<org.jooq.examples.mysql.sakila.tables.records.CountryRecord> KEY_country_PRIMARY = createUniqueKey(org.jooq.examples.mysql.sakila.tables.Country.COUNTRY, org.jooq.examples.mysql.sakila.tables.Country.COUNTRY_ID);
	public static final org.jooq.UniqueKey<org.jooq.examples.mysql.sakila.tables.records.CustomerRecord> KEY_customer_PRIMARY = createUniqueKey(org.jooq.examples.mysql.sakila.tables.Customer.CUSTOMER, org.jooq.examples.mysql.sakila.tables.Customer.CUSTOMER_ID);
	public static final org.jooq.UniqueKey<org.jooq.examples.mysql.sakila.tables.records.FilmRecord> KEY_film_PRIMARY = createUniqueKey(org.jooq.examples.mysql.sakila.tables.Film.FILM, org.jooq.examples.mysql.sakila.tables.Film.FILM_ID);
	public static final org.jooq.UniqueKey<org.jooq.examples.mysql.sakila.tables.records.FilmActorRecord> KEY_film_actor_PRIMARY = createUniqueKey(org.jooq.examples.mysql.sakila.tables.FilmActor.FILM_ACTOR, org.jooq.examples.mysql.sakila.tables.FilmActor.ACTOR_ID, org.jooq.examples.mysql.sakila.tables.FilmActor.FILM_ID);
	public static final org.jooq.UniqueKey<org.jooq.examples.mysql.sakila.tables.records.FilmCategoryRecord> KEY_film_category_PRIMARY = createUniqueKey(org.jooq.examples.mysql.sakila.tables.FilmCategory.FILM_CATEGORY, org.jooq.examples.mysql.sakila.tables.FilmCategory.FILM_ID, org.jooq.examples.mysql.sakila.tables.FilmCategory.CATEGORY_ID);
	public static final org.jooq.UniqueKey<org.jooq.examples.mysql.sakila.tables.records.FilmTextRecord> KEY_film_text_PRIMARY = createUniqueKey(org.jooq.examples.mysql.sakila.tables.FilmText.FILM_TEXT, org.jooq.examples.mysql.sakila.tables.FilmText.FILM_ID);
	public static final org.jooq.UniqueKey<org.jooq.examples.mysql.sakila.tables.records.InventoryRecord> KEY_inventory_PRIMARY = createUniqueKey(org.jooq.examples.mysql.sakila.tables.Inventory.INVENTORY, org.jooq.examples.mysql.sakila.tables.Inventory.INVENTORY_ID);
	public static final org.jooq.UniqueKey<org.jooq.examples.mysql.sakila.tables.records.LanguageRecord> KEY_language_PRIMARY = createUniqueKey(org.jooq.examples.mysql.sakila.tables.Language.LANGUAGE, org.jooq.examples.mysql.sakila.tables.Language.LANGUAGE_ID);
	public static final org.jooq.UniqueKey<org.jooq.examples.mysql.sakila.tables.records.PaymentRecord> KEY_payment_PRIMARY = createUniqueKey(org.jooq.examples.mysql.sakila.tables.Payment.PAYMENT, org.jooq.examples.mysql.sakila.tables.Payment.PAYMENT_ID);
	public static final org.jooq.UniqueKey<org.jooq.examples.mysql.sakila.tables.records.RentalRecord> KEY_rental_PRIMARY = createUniqueKey(org.jooq.examples.mysql.sakila.tables.Rental.RENTAL, org.jooq.examples.mysql.sakila.tables.Rental.RENTAL_ID);
	public static final org.jooq.UniqueKey<org.jooq.examples.mysql.sakila.tables.records.RentalRecord> KEY_rental_rental_date = createUniqueKey(org.jooq.examples.mysql.sakila.tables.Rental.RENTAL, org.jooq.examples.mysql.sakila.tables.Rental.RENTAL_DATE, org.jooq.examples.mysql.sakila.tables.Rental.INVENTORY_ID, org.jooq.examples.mysql.sakila.tables.Rental.CUSTOMER_ID);
	public static final org.jooq.UniqueKey<org.jooq.examples.mysql.sakila.tables.records.StaffRecord> KEY_staff_PRIMARY = createUniqueKey(org.jooq.examples.mysql.sakila.tables.Staff.STAFF, org.jooq.examples.mysql.sakila.tables.Staff.STAFF_ID);
	public static final org.jooq.UniqueKey<org.jooq.examples.mysql.sakila.tables.records.StoreRecord> KEY_store_PRIMARY = createUniqueKey(org.jooq.examples.mysql.sakila.tables.Store.STORE, org.jooq.examples.mysql.sakila.tables.Store.STORE_ID);
	public static final org.jooq.UniqueKey<org.jooq.examples.mysql.sakila.tables.records.StoreRecord> KEY_store_idx_unique_manager = createUniqueKey(org.jooq.examples.mysql.sakila.tables.Store.STORE, org.jooq.examples.mysql.sakila.tables.Store.MANAGER_STAFF_ID);

	// FOREIGN KEY definitions
	public static final org.jooq.ForeignKey<org.jooq.examples.mysql.sakila.tables.records.AddressRecord, org.jooq.examples.mysql.sakila.tables.records.CityRecord> fk_address_city = createForeignKey(KEY_city_PRIMARY, org.jooq.examples.mysql.sakila.tables.Address.ADDRESS, org.jooq.examples.mysql.sakila.tables.Address.CITY_ID);
	public static final org.jooq.ForeignKey<org.jooq.examples.mysql.sakila.tables.records.CityRecord, org.jooq.examples.mysql.sakila.tables.records.CountryRecord> fk_city_country = createForeignKey(KEY_country_PRIMARY, org.jooq.examples.mysql.sakila.tables.City.CITY, org.jooq.examples.mysql.sakila.tables.City.COUNTRY_ID);
	public static final org.jooq.ForeignKey<org.jooq.examples.mysql.sakila.tables.records.CustomerRecord, org.jooq.examples.mysql.sakila.tables.records.StoreRecord> fk_customer_store = createForeignKey(KEY_store_PRIMARY, org.jooq.examples.mysql.sakila.tables.Customer.CUSTOMER, org.jooq.examples.mysql.sakila.tables.Customer.STORE_ID);
	public static final org.jooq.ForeignKey<org.jooq.examples.mysql.sakila.tables.records.CustomerRecord, org.jooq.examples.mysql.sakila.tables.records.AddressRecord> fk_customer_address = createForeignKey(KEY_address_PRIMARY, org.jooq.examples.mysql.sakila.tables.Customer.CUSTOMER, org.jooq.examples.mysql.sakila.tables.Customer.ADDRESS_ID);
	public static final org.jooq.ForeignKey<org.jooq.examples.mysql.sakila.tables.records.FilmRecord, org.jooq.examples.mysql.sakila.tables.records.LanguageRecord> fk_film_language = createForeignKey(KEY_language_PRIMARY, org.jooq.examples.mysql.sakila.tables.Film.FILM, org.jooq.examples.mysql.sakila.tables.Film.LANGUAGE_ID);
	public static final org.jooq.ForeignKey<org.jooq.examples.mysql.sakila.tables.records.FilmRecord, org.jooq.examples.mysql.sakila.tables.records.LanguageRecord> fk_film_language_original = createForeignKey(KEY_language_PRIMARY, org.jooq.examples.mysql.sakila.tables.Film.FILM, org.jooq.examples.mysql.sakila.tables.Film.ORIGINAL_LANGUAGE_ID);
	public static final org.jooq.ForeignKey<org.jooq.examples.mysql.sakila.tables.records.FilmActorRecord, org.jooq.examples.mysql.sakila.tables.records.ActorRecord> fk_film_actor_actor = createForeignKey(KEY_actor_PRIMARY, org.jooq.examples.mysql.sakila.tables.FilmActor.FILM_ACTOR, org.jooq.examples.mysql.sakila.tables.FilmActor.ACTOR_ID);
	public static final org.jooq.ForeignKey<org.jooq.examples.mysql.sakila.tables.records.FilmActorRecord, org.jooq.examples.mysql.sakila.tables.records.FilmRecord> fk_film_actor_film = createForeignKey(KEY_film_PRIMARY, org.jooq.examples.mysql.sakila.tables.FilmActor.FILM_ACTOR, org.jooq.examples.mysql.sakila.tables.FilmActor.FILM_ID);
	public static final org.jooq.ForeignKey<org.jooq.examples.mysql.sakila.tables.records.FilmCategoryRecord, org.jooq.examples.mysql.sakila.tables.records.FilmRecord> fk_film_category_film = createForeignKey(KEY_film_PRIMARY, org.jooq.examples.mysql.sakila.tables.FilmCategory.FILM_CATEGORY, org.jooq.examples.mysql.sakila.tables.FilmCategory.FILM_ID);
	public static final org.jooq.ForeignKey<org.jooq.examples.mysql.sakila.tables.records.FilmCategoryRecord, org.jooq.examples.mysql.sakila.tables.records.CategoryRecord> fk_film_category_category = createForeignKey(KEY_category_PRIMARY, org.jooq.examples.mysql.sakila.tables.FilmCategory.FILM_CATEGORY, org.jooq.examples.mysql.sakila.tables.FilmCategory.CATEGORY_ID);
	public static final org.jooq.ForeignKey<org.jooq.examples.mysql.sakila.tables.records.InventoryRecord, org.jooq.examples.mysql.sakila.tables.records.FilmRecord> fk_inventory_film = createForeignKey(KEY_film_PRIMARY, org.jooq.examples.mysql.sakila.tables.Inventory.INVENTORY, org.jooq.examples.mysql.sakila.tables.Inventory.FILM_ID);
	public static final org.jooq.ForeignKey<org.jooq.examples.mysql.sakila.tables.records.InventoryRecord, org.jooq.examples.mysql.sakila.tables.records.StoreRecord> fk_inventory_store = createForeignKey(KEY_store_PRIMARY, org.jooq.examples.mysql.sakila.tables.Inventory.INVENTORY, org.jooq.examples.mysql.sakila.tables.Inventory.STORE_ID);
	public static final org.jooq.ForeignKey<org.jooq.examples.mysql.sakila.tables.records.PaymentRecord, org.jooq.examples.mysql.sakila.tables.records.CustomerRecord> fk_payment_customer = createForeignKey(KEY_customer_PRIMARY, org.jooq.examples.mysql.sakila.tables.Payment.PAYMENT, org.jooq.examples.mysql.sakila.tables.Payment.CUSTOMER_ID);
	public static final org.jooq.ForeignKey<org.jooq.examples.mysql.sakila.tables.records.PaymentRecord, org.jooq.examples.mysql.sakila.tables.records.StaffRecord> fk_payment_staff = createForeignKey(KEY_staff_PRIMARY, org.jooq.examples.mysql.sakila.tables.Payment.PAYMENT, org.jooq.examples.mysql.sakila.tables.Payment.STAFF_ID);
	public static final org.jooq.ForeignKey<org.jooq.examples.mysql.sakila.tables.records.PaymentRecord, org.jooq.examples.mysql.sakila.tables.records.RentalRecord> fk_payment_rental = createForeignKey(KEY_rental_PRIMARY, org.jooq.examples.mysql.sakila.tables.Payment.PAYMENT, org.jooq.examples.mysql.sakila.tables.Payment.RENTAL_ID);
	public static final org.jooq.ForeignKey<org.jooq.examples.mysql.sakila.tables.records.RentalRecord, org.jooq.examples.mysql.sakila.tables.records.InventoryRecord> fk_rental_inventory = createForeignKey(KEY_inventory_PRIMARY, org.jooq.examples.mysql.sakila.tables.Rental.RENTAL, org.jooq.examples.mysql.sakila.tables.Rental.INVENTORY_ID);
	public static final org.jooq.ForeignKey<org.jooq.examples.mysql.sakila.tables.records.RentalRecord, org.jooq.examples.mysql.sakila.tables.records.CustomerRecord> fk_rental_customer = createForeignKey(KEY_customer_PRIMARY, org.jooq.examples.mysql.sakila.tables.Rental.RENTAL, org.jooq.examples.mysql.sakila.tables.Rental.CUSTOMER_ID);
	public static final org.jooq.ForeignKey<org.jooq.examples.mysql.sakila.tables.records.RentalRecord, org.jooq.examples.mysql.sakila.tables.records.StaffRecord> fk_rental_staff = createForeignKey(KEY_staff_PRIMARY, org.jooq.examples.mysql.sakila.tables.Rental.RENTAL, org.jooq.examples.mysql.sakila.tables.Rental.STAFF_ID);
	public static final org.jooq.ForeignKey<org.jooq.examples.mysql.sakila.tables.records.StaffRecord, org.jooq.examples.mysql.sakila.tables.records.AddressRecord> fk_staff_address = createForeignKey(KEY_address_PRIMARY, org.jooq.examples.mysql.sakila.tables.Staff.STAFF, org.jooq.examples.mysql.sakila.tables.Staff.ADDRESS_ID);
	public static final org.jooq.ForeignKey<org.jooq.examples.mysql.sakila.tables.records.StaffRecord, org.jooq.examples.mysql.sakila.tables.records.StoreRecord> fk_staff_store = createForeignKey(KEY_store_PRIMARY, org.jooq.examples.mysql.sakila.tables.Staff.STAFF, org.jooq.examples.mysql.sakila.tables.Staff.STORE_ID);
	public static final org.jooq.ForeignKey<org.jooq.examples.mysql.sakila.tables.records.StoreRecord, org.jooq.examples.mysql.sakila.tables.records.StaffRecord> fk_store_staff = createForeignKey(KEY_staff_PRIMARY, org.jooq.examples.mysql.sakila.tables.Store.STORE, org.jooq.examples.mysql.sakila.tables.Store.MANAGER_STAFF_ID);
	public static final org.jooq.ForeignKey<org.jooq.examples.mysql.sakila.tables.records.StoreRecord, org.jooq.examples.mysql.sakila.tables.records.AddressRecord> fk_store_address = createForeignKey(KEY_address_PRIMARY, org.jooq.examples.mysql.sakila.tables.Store.STORE, org.jooq.examples.mysql.sakila.tables.Store.ADDRESS_ID);

	/**
	 * No instances
	 */
	private Keys() {}
}
