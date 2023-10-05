package org.jooq.impl;

import org.jooq.Configuration;
import org.jooq.Routine;

public abstract class AbstractRoutine<T> extends AbstractQueryPart implements Routine<T> {
  @Override
  public final Configuration configuration() {
    return null;
  }
}