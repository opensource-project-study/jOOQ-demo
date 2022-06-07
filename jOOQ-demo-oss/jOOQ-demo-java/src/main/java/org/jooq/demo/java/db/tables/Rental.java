/*
 * This file is generated by jOOQ.
 */
package org.jooq.demo.java.db.tables;


import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function7;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row7;
import org.jooq.Schema;
import org.jooq.SelectField;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.demo.java.db.Indexes;
import org.jooq.demo.java.db.Keys;
import org.jooq.demo.java.db.Public;
import org.jooq.demo.java.db.tables.records.RentalRecord;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Rental extends TableImpl<RentalRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>public.rental</code>
     */
    public static final Rental RENTAL = new Rental();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<RentalRecord> getRecordType() {
        return RentalRecord.class;
    }

    /**
     * The column <code>public.rental.rental_id</code>.
     */
    public final TableField<RentalRecord, Long> RENTAL_ID = createField(DSL.name("rental_id"), SQLDataType.BIGINT.nullable(false).identity(true), this, "");

    /**
     * The column <code>public.rental.rental_date</code>.
     */
    public final TableField<RentalRecord, LocalDateTime> RENTAL_DATE = createField(DSL.name("rental_date"), SQLDataType.LOCALDATETIME(6).nullable(false), this, "");

    /**
     * The column <code>public.rental.inventory_id</code>.
     */
    public final TableField<RentalRecord, Long> INVENTORY_ID = createField(DSL.name("inventory_id"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>public.rental.customer_id</code>.
     */
    public final TableField<RentalRecord, Long> CUSTOMER_ID = createField(DSL.name("customer_id"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>public.rental.return_date</code>.
     */
    public final TableField<RentalRecord, LocalDateTime> RETURN_DATE = createField(DSL.name("return_date"), SQLDataType.LOCALDATETIME(6), this, "");

    /**
     * The column <code>public.rental.staff_id</code>.
     */
    public final TableField<RentalRecord, Long> STAFF_ID = createField(DSL.name("staff_id"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>public.rental.last_update</code>.
     */
    public final TableField<RentalRecord, LocalDateTime> LAST_UPDATE = createField(DSL.name("last_update"), SQLDataType.LOCALDATETIME(6).nullable(false).defaultValue(DSL.field("now()", SQLDataType.LOCALDATETIME)), this, "");

    private Rental(Name alias, Table<RentalRecord> aliased) {
        this(alias, aliased, null);
    }

    private Rental(Name alias, Table<RentalRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>public.rental</code> table reference
     */
    public Rental(String alias) {
        this(DSL.name(alias), RENTAL);
    }

    /**
     * Create an aliased <code>public.rental</code> table reference
     */
    public Rental(Name alias) {
        this(alias, RENTAL);
    }

    /**
     * Create a <code>public.rental</code> table reference
     */
    public Rental() {
        this(DSL.name("rental"), null);
    }

    public <O extends Record> Rental(Table<O> child, ForeignKey<O, RentalRecord> key) {
        super(child, key, RENTAL);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Public.PUBLIC;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.asList(Indexes.IDX_FK_INVENTORY_ID, Indexes.IDX_UNQ_RENTAL_RENTAL_DATE_INVENTORY_ID_CUSTOMER_ID);
    }

    @Override
    public Identity<RentalRecord, Long> getIdentity() {
        return (Identity<RentalRecord, Long>) super.getIdentity();
    }

    @Override
    public UniqueKey<RentalRecord> getPrimaryKey() {
        return Keys.RENTAL_PKEY;
    }

    @Override
    public List<ForeignKey<RentalRecord, ?>> getReferences() {
        return Arrays.asList(Keys.RENTAL__RENTAL_INVENTORY_ID_FKEY, Keys.RENTAL__RENTAL_CUSTOMER_ID_FKEY, Keys.RENTAL__RENTAL_STAFF_ID_FKEY);
    }

    private transient Inventory _inventory;
    private transient Customer _customer;
    private transient Staff _staff;

    /**
     * Get the implicit join path to the <code>public.inventory</code> table.
     */
    public Inventory inventory() {
        if (_inventory == null)
            _inventory = new Inventory(this, Keys.RENTAL__RENTAL_INVENTORY_ID_FKEY);

        return _inventory;
    }

    /**
     * Get the implicit join path to the <code>public.customer</code> table.
     */
    public Customer customer() {
        if (_customer == null)
            _customer = new Customer(this, Keys.RENTAL__RENTAL_CUSTOMER_ID_FKEY);

        return _customer;
    }

    /**
     * Get the implicit join path to the <code>public.staff</code> table.
     */
    public Staff staff() {
        if (_staff == null)
            _staff = new Staff(this, Keys.RENTAL__RENTAL_STAFF_ID_FKEY);

        return _staff;
    }

    @Override
    public Rental as(String alias) {
        return new Rental(DSL.name(alias), this);
    }

    @Override
    public Rental as(Name alias) {
        return new Rental(alias, this);
    }

    @Override
    public Rental as(Table<?> alias) {
        return new Rental(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public Rental rename(String name) {
        return new Rental(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Rental rename(Name name) {
        return new Rental(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public Rental rename(Table<?> name) {
        return new Rental(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row7 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row7<Long, LocalDateTime, Long, Long, LocalDateTime, Long, LocalDateTime> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link #convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function7<? super Long, ? super LocalDateTime, ? super Long, ? super Long, ? super LocalDateTime, ? super Long, ? super LocalDateTime, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link #convertFrom(Class, Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function7<? super Long, ? super LocalDateTime, ? super Long, ? super Long, ? super LocalDateTime, ? super Long, ? super LocalDateTime, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
