package com.play4jpa.fixy;

public interface Fixy {

    /**
     * Loads one or more fixtures into the database.
     *
     * @param files list of fixture files using full qualified path names, e.g. com/example/fixtures/myfixture.yaml.
     */
    public void load(String... files);

    /**
     * Adds a processor to the Fixy.
     * Processors allow you to simulate stored procedures and other logic before your entities get persisted.
     * New entities can be added via the processor as well.
     *
     * @param postProcessor a processor that is called before entities will be persisted
     * @param <T>           the entity type on which the processor operates
     */
    public <T> void addProcessor(Processor<T> postProcessor);
}
