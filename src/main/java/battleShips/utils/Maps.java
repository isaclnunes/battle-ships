package battleShips.utils;

import java.util.AbstractMap;
import java.util.Collections;
import java.util.Map;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Maps {

	private Maps() {
	}

	public static <K, V> MapBuilder<K, V> builder(Supplier<Map<K, V>> mapSupplier) {
		return new MapBuilder<>(mapSupplier.get());
	}
	
	public static <K, V> Map.Entry<K, V> entry(K key, V value) {
        return new AbstractMap.SimpleEntry<>(key, value);
    }

    public static <K, U> Collector<Map.Entry<K, U>, ?, Map<K, U>> entriesToMap() {
        return Collectors.toMap((e) -> e.getKey(), (e) -> e.getValue());
    }

	private static class BaseBuilder<M extends Map<K, V>, K, V> {

		protected final M map;

		public BaseBuilder(M map) {
			this.map = map;
		}

		public BaseBuilder<M, K, V> put(K key, V value) {
			map.put(key, value);
			return this;
		}

		public M build() {
			return map;
		}

	}

	
	public static class MapBuilder<K, V> extends BaseBuilder<Map<K, V>, K, V> {
		
		private boolean unmodifiable;

		public MapBuilder(Map<K, V> map) {
			super(map);
		}

		@Override
		public MapBuilder<K, V> put(K key, V value) {
			super.put(key, value);
			return this;
		}

		public MapBuilder<K, V> unmodifiable(boolean unmodifiable) {
			this.unmodifiable = unmodifiable;
			return this;
		}

		@Override
		public Map<K, V> build() {
			if (unmodifiable) {
				return Collections.unmodifiableMap(super.build());
			} else {
				return super.build();
			}
		}

	}
}
