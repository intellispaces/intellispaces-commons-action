package tech.intellispaces.commons.action.interceptor.cache;

import tech.intellispaces.commons.action.Action0;
import tech.intellispaces.commons.action.wrapper.WrapperAction0;

import java.util.function.Function;

/**
 * Provider of cache interceptors.
 */
public interface CacheInterceptors {

  static <R> Function<Action0<R>, WrapperAction0<R>> cacheInterceptorFactory0() {
    return CachedInterceptor0::new;
  }
}

